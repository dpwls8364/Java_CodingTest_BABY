-- 코드를 입력하세요
SELECT CART_ID FROM CART_PRODUCTS
WHERE CART_ID IN (SELECT CART_ID FROM CART_PRODUCTS
                    WHERE NAME = 'Yogurt')
AND NAME = 'Milk' 
ORDER BY CART_ID