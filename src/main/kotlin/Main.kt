package org.example

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a name as a commant-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}
