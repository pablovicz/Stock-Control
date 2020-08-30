<template>
  <div class="list row">
    <div class="col-md-6">
      <h4>Products List</h4>
      <ul>
        <li v-for="(product, index) in products" :key="index">
          <router-link
            :to="{
                  name: 'product-details',
                  params: { product: product, id: product.id }
              }"
          >{{product.name}}</router-link>
        </li>
      </ul>
    </div>
    <div class="col-md-6">
      <router-view @refreshData="refreshList"></router-view>
    </div>
  </div>
</template>

<script>
import http from "../http-common.js";

export default {
  name: "products-list",
  data() {
    return {
      products: [],
    };
  },
  methods: {
    retrieveProducts() {
      http
        .get("/products")
        .then((response) => {
          this.products = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    refreshList() {
      this.retrieveProducts();
    },
  },
  mounted() {
    this.retrieveProducts();
  },
};
</script>

<style scoped>
.list {
  text-align: left;
  max-width: 450px;
  margin: auto;
}
</style>