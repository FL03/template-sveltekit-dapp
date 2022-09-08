import adapter from '@sveltejs/adapter-cloudflare';
import preprocess from "svelte-preprocess";

/** @type {import('@sveltejs/kit').Config} */
const config = {
	kit: {
		adapter: adapter(),
		methodOverride: {
			allowed: ['PATCH', 'DELETE']
		}
	},
	preprocess: [
		preprocess({
			postcss: true,
		}),
	]
};

export default config;
