SELECT
    COUNT(I.id)
FROM
    information I
WHERE
    I.is_delete = 0
AND EXISTS (
    SELECT IFT.information_type
    FROM information_type IFT
    WHERE I.id = IFT.information_type_id
    /*%if entity.informationTypeList != null */
        AND IFT.information_type IN /* entity.informationTypeList */(0)
    /*%end*/
)
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


