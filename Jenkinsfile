pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                // Download the code
                checkout scm
                // Compile the main class
                bat 'javac -d target -sourcepath src/main/java src/main/java/com/example/math/Calculator.java'
            }
        }
        stage('Test') {
            steps {
                // Compile the tests
                bat 'javac -d target -cp target:junit-platform-console-standalone-1.4.0.jar src/test/java/com/example/math/TestCalculator.java'
                // Run the tests
                bat 'java -jar junit-platform-console-standalone-1.4.0.jar --class-path target --scan-class-path --reports-dir=target/surefire-reports/'
            }
        }
    }
}
