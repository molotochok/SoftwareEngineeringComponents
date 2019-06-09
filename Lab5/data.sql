-- genders
INSERT INTO "genders" (gender_id, gender) VALUES (1, 'Male');
INSERT INTO "genders" (gender_id, gender) VALUES (2, 'Female');
INSERT INTO "genders" (gender_id, gender) VALUES (3, 'Other');

-- addresses
INSERT INTO "addresses" (address_id, country, city, street) VALUES (1, 'Ukraine', 'Lviv', 'Striiska 23/2');
INSERT INTO "addresses" (address_id, country, city, street) VALUES (2, 'Ukraine', 'Kyiv', 'Yangelia 1');
INSERT INTO "addresses" (address_id, country, city, street) VALUES (3, 'Ukraine', 'Kyiv', 'Koshina 5');

-- themes
INSERT INTO "themes" (theme_id, name, description) VALUES (1, 'Golodomor', 'Theme about eevents which were held in 1932-1933 in Ukraine');
INSERT INTO "themes" (theme_id, name, description) VALUES (2, 'Hollywood', 'Everything about movie industry');
INSERT INTO "themes" (theme_id, name, description) VALUES (3, 'Space', 'Space science-fiction');

-- compositions
INSERT INTO "compositions" (composition_id, title, description, published_date) VALUES (1, 'Adventures of Mikki Mouse', 'Some truly amazing adventures', '2012-02-10');
INSERT INTO "compositions" (composition_id, title, description, published_date) VALUES (2, 'Ship', 'Some ship', '2018-01-12');
INSERT INTO "compositions" (composition_id, title, description, published_date) VALUES (3, 'Star Wars', 'The best book ever', '1943-02-10');
INSERT INTO "compositions" (composition_id, title, description, published_date) VALUES (4, 'The lord of the rings', 'Book about ring and it lords', '2014-01-02');
INSERT INTO "compositions" (composition_id, title, description, published_date) VALUES (5, 'Crimea', 'Book about crimea', '2012-02-10');
INSERT INTO "compositions" (composition_id, title, description, published_date) VALUES (6, 'Book about books', 'Amazing book', '2012-02-10');

-- competitions
INSERT INTO "competitions" (competition_id, theme_id, address_id, visitors_number, start_date, end_date) VALUES (1, 1, 1, 500, '2019-02-11', '2019-02-20');
INSERT INTO "competitions" (competition_id, theme_id, address_id, visitors_number, start_date, end_date) VALUES (2, 2, 1 500, '2019-02-11', '2019-02-20');
INSERT INTO "competitions" (competition_id, theme_id, address_id, visitors_number, start_date, end_date) VALUES (3, 3, 1 20, '2018-05-11', '2018-05-22');

-- poets
INSERT INTO "poets" (poet_id, first_name, last_name, email, phone, address_id, gender_id) VALUES (1, 'Markiian', 'Karpa', 'markian@gmail.com', '024124123', 2, 1);
INSERT INTO "poets" (poet_id, first_name, last_name, email, phone, address_id, gender_id) VALUES (2, 'Elly', 'Espi', 'ellyes@pigmail.com', '2241231665', 2, 2);
INSERT INTO "poets" (poet_id, first_name, last_name, email, phone, address_id, gender_id) VALUES (3, 'Lucas', 'Do', 'lucasdo@outlokk.com', '0225768452', 3, 1);

-- competitions_poets
INSERT INTO "competitions_poets" (competitions_poets_id, competition_id, poet_id, points, performance_date) VALUES (1, 1, 1, 20,'2019-02-11');
INSERT INTO "competitions_poets" (competitions_poets_id, competition_id, poet_id, points, performance_date) VALUES (2, 1, 2, 12,'2019-02-12');
INSERT INTO "competitions_poets" (competitions_poets_id, competition_id, poet_id, points, performance_date) VALUES (3, 2, 1, 24,'2019-02-11');
INSERT INTO "competitions_poets" (competitions_poets_id, competition_id, poet_id, points, performance_date) VALUES (4, 2, 3, 24,'2018-05-11');
INSERT INTO "competitions_poets" (competitions_poets_id, competition_id, poet_id, points, performance_date) VALUES (5, 3, 3, 25,'2018-05-11');

-- poet_compositions
INSERT INTO "poet_compositions" (poet_compositions_id, poet_id, composition_id) VALUES (1, 1, 1);
INSERT INTO "poet_compositions" (poet_compositions_id, poet_id, composition_id) VALUES (2, 1, 2);
INSERT INTO "poet_compositions" (poet_compositions_id, poet_id, composition_id) VALUES (3, 1, 3);
INSERT INTO "poet_compositions" (poet_compositions_id, poet_id, composition_id) VALUES (4, 2, 4);
INSERT INTO "poet_compositions" (poet_compositions_id, poet_id, composition_id) VALUES (5, 2, 5);
INSERT INTO "poet_compositions" (poet_compositions_id, poet_id, composition_id) VALUES (6, 3, 6);