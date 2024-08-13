package currying

// here is a simple of how to curring in golang

// this is a simple add function
func Add(a int, b int) (c int) {
	return a + b
}

// curring is a strong tech help function easier to read and supporting functional paradigms
func CurringAdd(a int) func(b int) int {
	return func(b int) int {
		return a + b
	}
}
