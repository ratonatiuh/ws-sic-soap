from zeep import Client
from lxml import etree

client = Client('http://localhost:8080/ws/ordencompra.wsdl')

node = client.service.getOrdenCompra()

for i in node[0].producto:
        print(i.descripcion)
        print(i.precio)

