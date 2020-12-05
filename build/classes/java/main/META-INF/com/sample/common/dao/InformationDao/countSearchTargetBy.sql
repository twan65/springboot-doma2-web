SELECT
    COUNT(IF.id)
FROM
    information IF
WHERE
    IF.is_delete = 0
AND EXISTS (
    SELECT IFT.information_type
    FROM information_type IFT
    WHERE IF.id = IFT.information_type_id
    AND IFT.information_type IN /* entity.informationTypeList */(0)
)
/*%if entity.title != null */
    AND
        IF.title = /* @infix(entity.title) */''
/*%end*/

/*%if entity.overview != null */
    AND
        IF.overview = /* @infix(entity.overview) */''
/*%end*/

/*%if entity.displayStartDateFrom != null */
    AND
        DATE_FORMAT(IF.display_start_date, '%Y年%m月%d日') >= /* @infix(entity.displayStartDateFrom) */''
/*%end*/

/*%if entity.displayStartDateTo != null */
    AND
        DATE_FORMAT(IF.display_start_date, '%Y年%m月%d日') <= /* @infix(entity.displayStartDateTo) */''
/*%end*/

/*%if entity.displayEndDateFrom != null */
    AND
        DATE_FORMAT(IF.display_end_date, '%Y年%m月%d日') >= /* @infix(entity.displayEndDateFrom) */''
/*%end*/

/*%if entity.displayEndDateTo != null */
    AND
        DATE_FORMAT(IF.display_end_date, '%Y年%m月%d日') <= /* @infix(entity.displayEndDateTo) */''
/*%end*/


