<script>
  import '$lib/styles/app.css';
  import '$lib/styles/tailwind.css';

  import Navbar from '$lib/components/navigation/navbar/Navbar.svelte';
  import Footer from '$lib/components/navigation/footer/Footer.svelte'

</script>


<div class="bg-white dark:bg-zinc-700 text-black dark:text-white">
  <div class="flex flex-col">
    <Navbar brandName="PZZLD" />
    <main class=" min-h-screen py-12 px-10">
        <slot />
    </main>
    <Footer/>
  </div>
</div>