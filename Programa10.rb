=begin
Nombre:IGP Matr.:1234567 Hora:MV4
Lectura e impresion de un matriz
=end
print("Ingresa el total de filas de la matriz: ")
n = gets().to_i
print("Ingresa el total de columnas de la matriz: ")
m = gets().to_i
a = Array.new(n){Array.new(m)}
for i in (0...n)
for j in (0...m)
print("Ingresa a[#{i+1}][#{j+1}]: ")
a[i][j] = gets().to_i
end
end
puts("A[#{n}][#{m}]=")
for i in (0...n)
for j in (0...m)
print("#{a[i][j]}, ")
end
puts()
end
puts("Fin de impresion")
