=begin
do...while
=end
begin
print("Ingresa un numero(1 al 5): ")
x = gets().to_i
case x
when 1
puts("Ingresaste un 1")
when 2
puts("Ingresaste un 2")
when 3
puts("Ingresaste un 3")
when 4
puts("Ingresaste un 4")
when 5
puts("Ingresaste un 5")
else
puts("Ingresaste un numero menor a 1 o mayor a 5")
end
print("Deseas volver a ingresa un numero(1.Si/2.No): ")
respuesta = gets().to_i
end while(respuesta==1)
