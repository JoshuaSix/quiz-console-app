SELECT * FROM public.cat_values
limit 5

-- join cat_values table to cat table 
SELECT name as catname, 
-- created_by as role_type,
cat.id as catId,
-- cat_values.id as Cat_Values_Id,
cat_values.cat_id
FROM public.cat
Join cat_values on cat.id = cat_values.cat_id
where cat_values.cat_id > 2
order by cat_values.cat_id 
--limit 3

limit 5




SELECT SUM(product_stock) AS total_stock FROM public.product

SELECT * FROM public.product

-- Product profit margin(%10)
select product_name as product, 
product_price,
(product_price * 0.1) as profit_preProduct,
product_stock,
(product_price * product_stock) as Total_sales, 
(product_price * product_stock) * 0.1 as Stock_Product_Profit
from public.product; 

-- Product profit exceeding $2000 in order of product stock
select product_name as product, 
product_price,
(product_price * 0.1) as profit_preProduct,
product_stock,
(product_price * product_stock) as Total_sales, 
(product_price * product_stock) * 0.1 as Stock_Product_Profit
from public.product 
where (product_price * product_stock) * 0.1  > 2000
order by  product_stock;


-- Product profit exceeding $2000 in order of product_price
select product_name as product, 
product_price,
(product_price * 0.1) as profit_preProduct,
product_stock,
(product_price * product_stock) as Total_sales, 
(product_price * product_stock) * 0.1 as Stock_Product_Profit
from public.product 
where (product_price * product_stock) * 0.1  > 2000
order by  pro;


-- Product profit exceeding $2000
select product_name as product, 
product_price,
(product_price * 0.1) as profit_preProduct,
product_stock,
(product_price * product_stock) as Total_sales, 
(product_price * product_stock) * 0.1 as Stock_Product_Profit
from public.product 
where (product_price * product_stock) * 0.1  > 2000;



 where product_category = 'Electronics' AND product_brand = 'Apple';






