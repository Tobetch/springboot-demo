INSERT INTO
    task (name, content, deadline)
VALUES
    (
        "RaiseTech受講",
        "４ヶ月間頑張る",
        DATE_ADD(NOW(), INTERVAL 120 DAY)
    );