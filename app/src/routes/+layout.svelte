<script>
	import Footer from '$lib/footer/Footer.svelte';
	import Navbar from '$lib/navbar/Navbar.svelte';
	import '../app.css';
	let brand = {
      name: "App",
      slug: "app",
      tagline: "Welcome to your custom dApp written in SvelteKit",
      type: "",
      website: "/"
    }
	let pages = [
		{
			"endpoint": "/",
			"label": "Dashboard"
		},
		{
			"endpoint": "/about", 
			"label": "About"
		}, 
		{
			"endpoint": "/todos", 
			"label":"ToDos"
		}
	]
</script>

<div class="flex min-h-screen m-0 p-0">
	<div class="flex-1 bg-slate-400 dark:bg-slate-800">
		<Navbar brand = {brand} views={pages}/>
		<div class="container mx-auto">
			<main class="flex my-16 p-3">
				<slot />
			</main>
		</div>
		<Footer/>
	</div>
</div>


<style>
	
</style>
