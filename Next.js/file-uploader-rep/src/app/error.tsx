'use client';

import { useEffect, useEffectEvent } from "react";

export default function Error({
    error,
    reset,
}: {
    error: Error & { digest?: string };
    reset: () => void;
}) {
    useEffect(() => {
        console.log(error);
    }, [error]);

    return (
        <div className="p-5 flex justify-center">
            <p>Error!</p>
        </div>
    )
}
