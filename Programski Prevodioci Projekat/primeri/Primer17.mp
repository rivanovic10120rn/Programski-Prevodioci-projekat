main(){
    hex: int;
    hex = $F15;
    do write(hex); while (hex>$FFF)
    do read(hex); while (hex>$FFF)
    do hex = $11; while (hex>$FFF)
}