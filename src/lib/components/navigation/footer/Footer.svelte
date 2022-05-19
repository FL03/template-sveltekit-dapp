<script>
    import {chainData, chainId, connected} from "svelte-web3";
</script>

<footer class="absolute bottom-0 flex flex-wrap z-50">
    <div class="container px-4 mx-auto flex flex-wrap items-center justify-between">
        <ul class="flex flex-col lg:flex-row list-none mr-auto">
            <li class="flex items-center">
                <div class="px-3 py-2 flex items-center">
                    <a class="hover:text-gray-500" href="https://github.com/fl03" target="_blank">Github</a>
                </div>
            </li>
            <li class="flex items-center">
                <div class="px-3 py-2 flex items-center">
                    {#if !$connected}
                        My application is not yet connected
                    {:else}
                        Connected to chain with id {$chainId}
                    {/if}
                </div>
            </li>
            <li class="flex items-center">
                <div class="px-3 py-2 flex items-center">
                    <h1 class="font-bold">{$chainData?.name}</h1>
                    <p>Native Currency: {$chainData?.nativeCurrency?.name} ({$chainData?.nativeCurrency?.symbol})</p>
                </div>
            </li>
        </ul>
    </div>
</footer>