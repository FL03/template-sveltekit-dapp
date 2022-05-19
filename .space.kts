job("Build and Push: Backend (Scattered-Systems)") {
    docker {
        build {
            context = "./app/backend/app"
            file = "./app/backend/app/Dockerfile"
            args["HTTP_PROXY"] = "http://0.0.0.0:8080"
            labels["vendor"] = "scattered-systems"
        }

        push("scattered-systems.registry.jetbrains.space/p/scsys/containers/scsys-backend") {
            tags("0.0.\$JB_SPACE_EXECUTION_NUMBER", "latest")
        }
    }
}

job("Build and Push: Contracts (Scattered-Systems)") {
    docker {
        build {
            context = "./app/contracts/app"
            file = "./app/contracts/app/Dockerfile"
            args["HTTP_PROXY"] = "http://0.0.0.0:8545"
            labels["vendor"] = "scattered-systems"
        }

        push("scattered-systems.registry.jetbrains.space/p/scsys/containers/scsys-contracts") {
            tags("0.0.\$JB_SPACE_EXECUTION_NUMBER", "latest")
        }
    }
}

job("Build and Push: Frontend (Scattered-Systems)") {
    docker {
        build {
            context = "./app/frontend/app"
            file = "./app/frontend/app/Dockerfile"
            args["HTTP_PROXY"] = "http://0.0.0.0:3000"
            labels["vendor"] = "scattered-systems"
        }

        push("scattered-systems.registry.jetbrains.space/p/scsys/containers/scsys-frontend") {
            tags("0.0.\$JB_SPACE_EXECUTION_NUMBER", "latest")
        }
    }
}