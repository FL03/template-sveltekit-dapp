<script>
	import Footer from '$lib/components/footer/Footer.svelte';
	import Navbar from '$lib/components/nav/Navbar.svelte';
	import '../app.css';
	let brand  = {
		abbr: "scsys",
		name: "Scattered-Systems",
		slug: "scattered-systems",
		tagline: "Welcome to the future of internet-based experiences",
		type: "LLC",
		website: "https://scattered-systems.com"
	}
	let views = [
		{
			id: 0,
			key: "homepage",
			label: "Home",
			endpoint: "/"
		}
	]
</script>

<div class="flex">
	<div class="flex-auto min-h-screen bg-gradient-to-r from-cyan-500 to-blue-500">
		<div class="container mx-auto">
			<Navbar brand={brand} />
			<main class="flex-auto mt-3 py-3 rounded ">
				<slot />
			</main>
			<Footer brand={brand}/>
		</div>
		
	</div>
</div>
