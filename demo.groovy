node {  
    a=50
    stage('Build') { 
        echo 'hello world' 
    }
    stage('Test') { 
        sh 'ls -a'
    }
    stage('Deploy') { 
        echo 'you are hear'
    }
}
