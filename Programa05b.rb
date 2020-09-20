=begin
Numeros Naturales
=end
print("Ingresa un numero total de datos: ")
n=gets().to_i
for i in (1..n).step 2
print("#{i}, ")
end
