package currying

func AddTwo(a int, b int) (result int) {
	return a + b
}

func AddThree(a int, b int, c int) (result int) {
	return a + b + c
}

func AddThreeWizP(input int, c int) (result int) {
	return input + c
}
