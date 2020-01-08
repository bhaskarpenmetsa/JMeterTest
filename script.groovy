   agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: '1c625b59-38b8-4cd0-8f2d-07c3e1f29b1a', url: 'https://github.com/bhaskarpenmetsa/JMeterTest.git'

            }
        }
    }


node {
   stage 'Run JMeter Test'
   bat 'C:/Users/bpenmetsa/.jenkins/apache-jmeter-4.0/bin/jmeter.bat -n -t Decisiontech-Costing-Services.jmx -l C:/Users/bpenmetsa/.jenkins/workspace/results/testResult_%BUILD_NUMBER%.jtl'
}