<template>
  <div class="searchForm">
    <h4>Find By Name</h4>
    <div class="form-group">
      <input type="text" class="form-control" id="name" required v-model="name" name="name" />
    </div>

    <div class="btn-group">
      <button v-on:click="searchProducts" class="btn btn-success">Search</button>
    </div>

    <ul class="search-result">
      <li v-for="(product,index) in products" :key="index">
        <h6>{{product.name}} (U$ {{product.price}})</h6>
      </li>
    </ul>
  </div>
</template>

<script>
import http from "../http-common.js";

export default {
  name: "search-product",
  data() {
    return {
      name: "",
      products: [],
    };
  },
  methods: {
    searchProducts() {
      http
        .get("/product/name/" + this.name)
        .then((response) => {
          this.products = response.data;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>

<style scoped>
.searchForm {
  max-width: 300px;
  margin: auto;
}

.search-result {
  margin-top: 20px;
  text-align: left;
}
</style>