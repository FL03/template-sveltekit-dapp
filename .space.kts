job("Build and Push: template-sveltekit") {
    docker {
        build {
            context = "."
            file = "./Dockerfile"
            args["HTTP_PROXY"] = "http://0.0.0.0:3000"
            labels["vendor"] = "scattered-systems"
        }

        push("scattered-systems.registry.jetbrains.space/p/scsys/containers/template-sveltekit") {
            tags("0.0.\$JB_SPACE_EXECUTION_NUMBER", "latest")
        }
    }
}