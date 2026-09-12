# Write your MySQL query statement below
select 
    b.book_id, b.title, b.author, b.genre, b.publication_year, count(*) as current_borrowers 
from library_books b 
join borrowing_records l 
    on b.book_id = l.book_id
where l.return_date is null
group by 
    b.book_id,
    b.title,
    b.author,
    b.genre,
    b.publication_year,
    b.total_copies
having count(*) = b.total_copies
order by 
    current_borrowers desc, 
    b.title asc;