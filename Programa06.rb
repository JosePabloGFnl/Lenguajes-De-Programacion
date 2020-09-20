=begin
Switch
=end
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
