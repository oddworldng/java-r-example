args <- commandArgs(TRUE)

if (length(args) == 0) {
	print('Hello R World')
} else {
	print(args)
}