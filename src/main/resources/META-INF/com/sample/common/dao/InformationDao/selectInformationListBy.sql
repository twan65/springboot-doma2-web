SELECT
    *
FROM
    information IF
WHERE
    I.is_delete = 0

/*%if entity.title != null */
    AND
        I.title = /* @infix(entity.title) */''
/*%end*/

/*%if entity.overview != null */
    AND
        I.overview = /* @infix(entity.overview) */''
/*%end*/

/*%if entity.displayStartDateFrom != null */
    AND
        DATE_FORMAT(I.display_start_date, '%Y年%m月%d日') >= /* @infix(entity.displayStartDateFrom) */''
/*%end*/

/*%if entity.displayStartDateTo != null */
    AND
        DATE_FORMAT(I.display_start_date, '%Y年%m月%d日') <= /* @infix(entity.displayStartDateTo) */''
/*%end*/

/*%if entity.displayEndDateFrom != null */
    AND
        DATE_FORMAT(I.display_end_date, '%Y年%m月%d日') >= /* @infix(entity.displayEndDateFrom) */''
/*%end*/

/*%if entity.displayEndDateTo != null */
    AND
        DATE_FORMAT(I.display_end_date, '%Y年%m月%d日') <= /* @infix(entity.displayEndDateTo) */''
/*%end*/


