pipeline{
    agent any
    environment {
      WS = "${WORKSPACE}"
      IMAGE_NAME = "xiangruo-jinkens-demo"
    }

    //定义流水线的加工流程
    stages {
        //流水线的所有阶段
        stage('1.环境检查'){
            steps {
               sh 'pwd && ls -alh'
               sh 'printenv'
               sh 'docker version'
               sh 'java -version'
               sh 'git --version'
            }
        }

        stage('2.编译'){
            agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v maven-repository:/root/.m2'
                 }
            }
            steps {
               sh 'pwd && ls -alh'
               sh 'mvn -v'
               sh 'cd ${WS} && mvn clean package -s "/home/apache-maven-3.8.6/conf/settings.xml" -Dmaven.test.skip=true'
            }
        }

        stage('3.打包'){
            steps {
               sh 'pwd && ls -alh'
               sh 'docker build -t ${IMAGE_NAME} .'
            }
        }
    }
}