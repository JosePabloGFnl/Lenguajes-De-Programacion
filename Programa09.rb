=begin
Nombre:Jose Pablo González Flores Matr.:198667 Hora:V5
Lectura e impresion de un vector
=end
print("Ingresa el total de elementos del vector: ")
n = gets().to_i
a = Array.new(n)
for i in (0...n)
print("Ingresa a[#{i+1}]: ")
a[i] = gets().to_i
end
puts()
puts()
print("A=[")
for i in (0...n)
print(a[i].to_s + ", ")
end
puts("]")
