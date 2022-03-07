/**
Calculate input expression. Example:
TaskCalculator.exec("6(3+1)") == 24
TaskCalculator.exec("1+9/3") == 4
*/

package groovylab

class TaskCalculator {
    public static Number exec(String expression) {
        parse(expression) { a, operator, b ->
            switch(operator) {
                case '-': return a - b; break
                case '+': return a + b; break
                case '*': return a * b; break
                case '/': return a.intdiv(b); break
            }
	}
    }
}
