<script>
	import Header from '$lib/header/Header.svelte';
    import '$lib/styles/app.css'
	import '$lib/styles/tailwind.css';
</script>


<div class="bg-white dark:bg-zinc-700 text-black dark:text-white">
  <div class="min-h-screen">
    <Header />
    <main>
        <slot />
    </main>
    <footer>
        <p>
          Homepage - <a href="https://pzzld.eth.link/">Puzzled</a>
        </p>
    </footer>
  </div>
</div>





<style>
	main {
		flex: 1;
		display: flex;
		flex-direction: column;
		padding: 1rem;
		width: 100%;
		max-width: 1024px;
		margin: 0 auto;
		box-sizing: border-box;
	}

	footer {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		padding: 40px;
	}

	footer a {
		font-weight: bold;
	}

	@media (min-width: 480px) {
		footer {
			padding: 40px 0;
		}
	}
</style>
