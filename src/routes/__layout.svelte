<script>
  import '$lib/styles/app.css';
  import '$lib/styles/nucleo-icons.css';
  import '$lib/styles/nucleo-svg.css';
  import '$lib/styles/tailwind.css';

  import Navbar from '$lib/components/navigation/navbar/Navbar.svelte';
  import Footer from '$lib/components/navigation/footer/Footer.svelte'

</script>


<div class="bg-gradient-to-r from-blue-500 to-cyan-600 text-black">
  <div class="flex flex-col">
    <Navbar>
      <span slot="brand">
        <p>Pzzld</p>
      </span>
    </Navbar>
    <main class="min-h-screen py-12 px-10">
        <slot />
    </main>
    <Footer/>
  </div>
</div>