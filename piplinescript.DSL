node {
   stage 'Run JMeter Test'
   bat 'D:/Jmeter/apache-jmeter-4.0/bin/jmeter.bat -n -t D:/price/flightbooking1.jmx -l test.jtl'
}
