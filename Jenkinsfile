pipeline {

    agent any

    triggers {
        githubPush()
    }

    environment {
        GITHUB_REPO = "https://github.com/VemulaNitheesh/Scientific-calculator-devOps.git"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: "${GITHUB_REPO}"
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Jar') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t calculator-image .'
            }
        }

        stage('DockerHub Push') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-cred',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {

                    sh '''
                    echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                    docker tag calculator-image nitheesh05/calculator:latest
                    docker push nitheesh05/calculator:latest
                    '''
                }
            }
        }

        stage('Deployment') {
            steps {
                sh 'ansible-playbook playbook.yml -i inventory.ini'
            }
        }

    }
    post {

        success {
            mail to: 'vemulanitheesh05@gmail.com',
            subject: "Build SUCCESS",
            body: "The Jenkins pipeline completed successfully."
        }

        failure {
            mail to: 'vemulanitheesh05@gmail.com',
            subject: "Build FAILED",
            body: "The Jenkins pipeline failed at build number ${env.BUILD_NUMBER}"
        }

    }
}
