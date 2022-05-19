<script>
    import {page} from '$app/stores';
    import {connected, selectedAccount} from "svelte-web3";

    export let background = "bg-transparent"
    export let brandName = "Brand"
    export let color = "text-black dark:text-white "
    export let links = [
      {
        id: 0,
        href: "/",
        label: "Home"
      }
    ];

    let navbarOpen = false;

    function setNavbarOpen() {
        navbarOpen !== navbarOpen
    }
</script>

<nav class="top-0 absolute z-50 w-full flex flex-wrap items-center justify-between px-2 py-3 navbar-expand-lg {background}">
    <div class="container px-4 mx-auto flex flex-wrap items-center justify-between">
        <div class="w-full relative flex justify-between lg:w-auto lg:static lg:block lg:justify-start">
            <a class="{color} text-sm font-bold leading-relaxed inline-block mr-4 py-2 whitespace-nowrap uppercase"
                   href="/" sveltekit:prefetch>
                  {brandName}
                </a>
            <button class="cursor-pointer text-xl leading-none px-3 py-1 border border-solid border-transparent rounded bg-transparent block lg:hidden outline-none focus:outline-none"
                    on:click="{setNavbarOpen}"
                    type="button"
            >
                <i class=""></i>
            </button>
        </div>
        <div class="lg:flex flex-grow items-center {navbarOpen ? 'block':'hidden'}" id="navigation-navbar">
            <ul class="flex flex-col lg:flex-row list-none mr-auto">
                {#each links as link}
                    <li class:active={$page.url.pathname === link.href} class="flex items-center">
                        <a class="hover:text-blueGray-500 {color} px-3 py-2 flex items-center text-xs uppercase font-bold"
                           href="{link.href}" sveltekit:prefetch>
                            {link.label}
                        </a>
                    </li>
                {/each}
            </ul>
            <ul class="flex flex-col lg:flex-row list-none mr-auto">
                    <li class="flex items-center">
                        <button>
                            {#if $connected}
                                Logout
                            {:else}
                                Login
                            {/if}
                        </button>
                    </li>
            </ul>
        </div>
    </div>
</nav>