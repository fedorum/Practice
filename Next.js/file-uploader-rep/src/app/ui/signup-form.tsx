'use client'

import { signup } from '../lib/auth'
import { useActionState } from 'react'

export default function SignupForm() {
    const [state, action, pending] = useActionState(signup, undefined)

    return (
        <form action={action} className="flex flex-col p-5 bg-gray-100 w-fit text-left rounded-md">
            <label htmlFor="adid" className="mb-2">ADID</label>
            <input type="text" id="adid" name='adid' className="py-0.5 px-1 bg-white border border-gray-400 rounded-sm"/>
            {state?.errors?.adid && <p>{state.errors.adid}</p>}

            <label htmlFor="password" className="mt-3 mb-2">Password</label>
            <input type="password" id="password" name='password' className="py-0.5 px-1 bg-white border border-gray-400 rounded-sm"/>
            {state?.errors?.password && (
                <div>
                    <p>Password must:</p>
                    <ul>
                        {state.errors.password.map((error) => (
                            <li key={error}>- {error}</li>
                        ))}
                    </ul>
                </div>
            )}

            <button disabled={pending} type="submit" className="mt-5 py-0.5 px-1 bg-white hover:bg-neutral-50 border border-gray-400 rounded-sm text-center">Login</button>
        </form>
    )
} 
