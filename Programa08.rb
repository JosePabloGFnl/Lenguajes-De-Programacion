=begin
while
=end
print("Ingresa un numero entero positivo: ")
x = gets().to_i
print("#{x},")
while(x!=1)
if(x%2==0) then
x = x/2
else
x = x*3 + 1
end#Fin del if
print("#{x},")
end#Fin del while
