package groovylab

class App {
    static void main(String[] args) {
        println "Task01.sum(1,4) == ${Task01.sum(1,4)}"
	println "Task02.mulEvenOdd([4,5,6]) == ${Task02.mulEvenOdd([4,5,6])}"
	println "Task03.isSublist([1,2,3], [2,3]) == ${Task03.isSublist([1,2,3], [2,3])}"
	println "Task04.fib(4) == ${Task04.fib(4)}"
	println "Task05.isIP(10.0.152.164) == ${Task05.isIp("10.0.152.164")}"
	println "Task06.adults([Kate: 24, Alan:16, Osvald: 18]) == ${Task06.adults([Kate: 24, Alan:16, Osvald: 18])}"
	println "Task07.encryptThis(Hello) == ${Task07.encryptThis("Hello")}"
	println "Task07.encryptThis(hello world) == ${Task07.encryptThis("hello world")}"
	println "Task08.parseAndFilterJson(Kate:18,Alan:16,Osvald:27) == ${Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}")}"
	println "Task09.exec(date) == ${Task09.exec("date")}"
	println "Task10.urlText(http:httpstat.us.200) == ${Task10.urlText("http://httpstat.us/200")}"
	println "Task11.gstring(test, 2) == ${Task11.gstring("test", 2)}"
	println "Calculator(6(3+1)) =="
	println "Calculator(1+9:3) =="
    }
}
