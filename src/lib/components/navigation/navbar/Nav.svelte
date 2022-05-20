<script>
    export let background = "blur";
</script>

<nav class="navbar navbar-expand-lg  blur blur-rounded top-0 border-bottom z-index-3 shadow w-100 mt-4 d-none d-lg-block my-3 py-2">
  <div class="container-fluid">
    <a class="navbar-brand font-weight-bolder ms-3" href="" rel="tooltip" title="Designed and Coded by Creative Tim" data-placement="bottom" target="_blank">
      <slot name="brand"/>
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navigation">
      <ul class="navbar-nav navbar-nav-hover mx-auto">
        <li class="nav-item px-3">
          <a class="nav-link">
            Pages
          </a>
        </li>

        <li class="nav-item px-3">
          <a class="nav-link">
            Utilities
          </a>
        </li>

        <li class="nav-item px-3">
          <a class="nav-link">
            Blocks
          </a>
        </li>

        <li class="nav-item px-3">
          <a class="nav-link">
            Docs
          </a>
        </li>
      </ul>

      <ul class="navbar-nav">
        <button class="btn btn-sm  bg-gradient-dark  btn-round mb-0 me-1">Buy Now</button>
      </ul>
    </div>
  </div>
</nav>