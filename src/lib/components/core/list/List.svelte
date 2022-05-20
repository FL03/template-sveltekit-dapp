<script>
    export let items;
</script>

<ul>
    {#each items as item}
        <li id={item.id} key={item.key} class="">
            {item.content}
        </li>
    {/each}
</ul>