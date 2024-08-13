package main

import (
	"fmt"
	curring "github/ekreke/functional_thinking/examples/example3"
)

func main() {
	simpleResult := curring.Add(1, 2)
	fmt.Println(simpleResult)
	curringResult := curring.CurringAdd(1)
	result2 := curringResult(2)
	// this is a funciton value
	// fmt.Println(curringResult)
	fmt.Println(result2)

	// or we can use curring function like this
	result3 := curring.CurringAdd(1)(2)
	fmt.Println(result3)

	presult := curring.AddThreeWizP(curring.Add(1, 2), 2)
	fmt.Println(presult)
}
