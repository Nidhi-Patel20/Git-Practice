def runJob(par1, par2 ) {

    pipeline {
        agent any
        stages {
            stage("Print Status"){
                steps{
                    sh 'echo "Hi there!" '        
                }
            }
        }        
        post {
            failure {
                echo "Job Failed"
            }
        }
    }

}

return this