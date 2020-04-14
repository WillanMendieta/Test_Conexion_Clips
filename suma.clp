(deffunction sumatoria
	(?a ?b ?c)
	(bind ?total (+ ?a ?b ?c))

	(if (and (>= ?total 0) (<= ?total 45))
		then
		(printout t "Obtuvo un puntaje de : " ?total crlf)
		(printout t "         " crlf)
		(printout t "	No estás preservando 
	tu salud como deberías si tu objetivo es vivir muchos años y vivirlos 
	bien. Primer paso, convencete de la necesidad de un cambio y avanza. 
	Segunda instancia, consulta a un médico: necesitas conocer tu estado 
	físico y establecer un plan de vida saludable." crlf)
	)
	
	(if (and (>= ?total 46) (<= ?total 95))
		then
		(printout t "Obtuvo un puntaje de : " ?total crlf)
		(printout t "              " crlf)
		(printout t "	Si bien tienes un estándar de vida que alcanza los parámetros de lo saludable, 
	te falta para estar realmente bien encaminada. Revisa los ítems en los que obtuviste menos puntaje y, 
	una vez identificadas las debilidades, revertilas buscando información al respecto y adoptando algunas 
	de las sugerencias que ayudan a cuidar la salud." crlf)
	)
	
	(if (and (>= ?total 96) (<= ?total 150))
		then
		(printout t "Obtuvo un puntaje de : " ?total crlf)
		(printout t "         " crlf)
		(printout t "	Tienes una calidad de vida realmente saludable. Conservá tus hábitos y recuerda 
	que a medida que pasan los años debemos adaptanos a los cuidados e intensificarlos. El modo de lograrlo es
	continuar atenta a tus necesidades y mantener un estrecho contacto con tu cuerpo." crlf)
	)
)
