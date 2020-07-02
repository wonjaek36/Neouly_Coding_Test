import pymongo
from pymongo import MongoClient


def connect_mongodb(host, port):
	#TODO Fill MongoClient to connect localhost mongodb
	return MongoClient()

def get_database(client, db_name):
	#TODO return database of mongodb
	return None

def get_collection(db, coll_name):
	return db[coll_name]

def get_average_bytes(coll):
	avg = 0
	#TODO using collection.find()
	for doc in None:
		pass

if __name__ == "__main__":
	client = connect_mongodb("localhost", 27017)
	db = get_database(client, "config")
	coll = get_collection(db, "data")

	avg = get_average_bytes(coll)
	print (avg)
