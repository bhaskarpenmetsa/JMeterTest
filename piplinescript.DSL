node {
  stage 'Run JMeterTest'
  sh 'D:\Jmeter\apache-jmeter-4.0\bin\jmeter.sh -n -t D:\price\flightbooking1.jmx -l test.jtl'
}