import type { NextConfig } from "next";

const nextConfig: NextConfig = {
    // setting a temporary redirect to the login page to simulate authentication on entry
    // delete code here to reset to normal
    async redirects() {
        return [
            {
                source: '/',
                destination: '/login',
                permanent: true,
            },
        ];
    },
};

module.exports = nextConfig;
