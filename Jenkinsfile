node{
   stage('SCM Checkout'){
     git 'https://github.com/ChiragMakkar13/FirstDemo'
   }
   stage('Compile-Package'){
    
      def mvnHome =  tool name: 'Maven_Home', type: 'maven'   
      sh "${mvnHome}/bin/mvn package"
   }
}
