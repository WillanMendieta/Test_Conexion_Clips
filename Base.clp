(defrule regla1
	( pelo s) (mama s) (patas s)
=>
	(assert (mamifero))
)

(defrule regla2
	(mamifero s)
=> 
	(printout t "Animal Mamifero" crlf)
)

(defrule regla3
	(alas s)
=>
	(assert (aves))
)

(defrule regla4
	(ave s)
=>
	(printout t "Animal Ave" crlf)
)




