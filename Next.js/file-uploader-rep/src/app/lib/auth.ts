import { SignupFormSchema, FormState } from "./definitions";
import bcrypt from "bcryptjs";

export async function signup(state: FormState, formData: FormData) {
    // validation
    const validatedFields = SignupFormSchema.safeParse({
        adid: formData.get("adid"),
        password: formData.get("password"),
    })

    if (!validatedFields.success) {
        return {
            errors: validatedFields.error.flatten().fieldErrors,
        }
    }

    const { adid, password } = validatedFields.data

    const hashedPassword = await bcrypt.hash(password, 10);
}

import { betterAuth } from "better-auth";
import { prismaAdapter } from "better-auth/adapters/prisma";
import { PrismaClient } from "@prisma/client/extension";

const prisma = new PrismaClient();
export const auth = betterAuth({
    database: prismaAdapter(prisma, {
        provider: "sqlite",
    }),
});
