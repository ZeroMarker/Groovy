src = factorial
ext = groovy
cc = groovy

run: $(src).$(ext)
	$(cc) $^
