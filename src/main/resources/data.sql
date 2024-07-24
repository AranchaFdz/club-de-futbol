INSERT INTO football_associations (id, name, country, president) VALUES (DEFAULT, 'Asturias', 'Spain', 'Giaco');

INSERT INTO clubs (id, name, id_football_association) VALUES (DEFAULT, 'Real Madrid', (SELECT id FROM football_associations WHERE name = 'Asturias'));
INSERT INTO clubs (id, name, id_football_association) VALUES (DEFAULT, 'Barcelona', (SELECT id FROM football_associations WHERE name = 'Asturias'));
INSERT INTO clubs (id, name, id_football_association) VALUES (DEFAULT, 'Sporting', (SELECT id FROM football_associations WHERE name = 'Asturias'));

INSERT INTO players (id, name, last_name, nationality, age, position, id_club) VALUES (DEFAULT, 'Lionel', 'Messi', 'Argentinian', 36, 'Forward', (SELECT id FROM clubs WHERE name = 'Real Madrid'));
INSERT INTO players (id, name, last_name, nationality, age, position, id_club) VALUES (DEFAULT, 'Robert', 'Lewandowski', 'Polish', 35, 'Forward', (SELECT id FROM clubs WHERE name = 'Barcelona'));
INSERT INTO players (id, name, last_name, nationality, age, position, id_club) VALUES (DEFAULT, 'Bruno', 'Fernandes', 'Portuguese', 29, 'Midfielder', (SELECT id FROM clubs WHERE name = 'Barcelona'));

INSERT INTO football_competiotions (id, name, quantity_price, start_date, end_date) VALUES (DEFAULT, 'Champions League', 1000000, '2023-08-01', '2024-05-31');
INSERT INTO football_competiotions (id, name, quantity_price, start_date, end_date) VALUES (DEFAULT, 'La Liga', 500000, '2023-08-01', '2024-05-31');

INSERT INTO club_competitions (club, competition) VALUES ((SELECT id FROM clubs WHERE name = 'Real Madrid'), (SELECT id FROM football_competiotions WHERE name = 'Champions League'));
INSERT INTO club_competitions (club, competition) VALUES ((SELECT id FROM clubs WHERE name = 'Barcelona'), (SELECT id FROM football_competiotions WHERE name = 'Champions League'));
INSERT INTO club_competitions (club, competition) VALUES ((SELECT id FROM clubs WHERE name = 'Sporting'), (SELECT id FROM football_competiotions WHERE name = 'La Liga'));

