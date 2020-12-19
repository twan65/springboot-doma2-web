UPDATE
    information
SET
  title                 = /* entity.title */'',
  overview              = /* entity.overview */'',
  display_start_date    = /* entity.displayStartDate */'',
  display_end_date      = /* entity.displayEndDate */'',
  update_id             = /* entity.updateId */'',
  update_date_time      = /* entity.updateDateTime */''
WHERE
    is_delete = 0
AND
    id = /* entity.id */0

/*%if updateDateTime == null || updateDateTime.length() == 0 */
    AND
        update_date_time IS NULL
/*%else*/
    AND
        update_date_time = /* updateDateTime */''
/*%end*/
